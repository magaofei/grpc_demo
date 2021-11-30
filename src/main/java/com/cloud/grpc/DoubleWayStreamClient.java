package com.cloud.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;

public class DoubleWayStreamClient {

    public static void main(String[] args) {

        ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder.forAddress("localhost", 8899).usePlaintext();

        ManagedChannel channel = channelBuilder.build();

        StreamObserver<DoubleWayStream.RequestMessage> requestObserver =
            DoubleWayStreamServiceGrpc.newStub(channel).doubleWayStreamFun(new StreamObserver<DoubleWayStream.ResponseMessage>() {
                @Override public void onNext(DoubleWayStream.ResponseMessage responseMessage) {
                    System.out.println("收到服务端发来" + responseMessage.getRspMsg());
                }

                @Override public void onError(Throwable throwable) {
                    System.out.println("error ");
                }

                @Override public void onCompleted() {
                    System.out.println("on completed");
                }
            });

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            String str = scanner.nextLine();
            if (str.equals("EOF")) {
                requestObserver.onCompleted();
                break;
            }
            try {
                requestObserver.onNext(DoubleWayStream.RequestMessage.newBuilder().setReqMsg(scanner.nextLine()).build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
