package com.cloud.grpc;

import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class DoubleWayStreamServerIml extends DoubleWayStreamServiceGrpc.DoubleWayStreamServiceImplBase {

    private List<StreamObserver<DoubleWayStream.ResponseMessage>> responseMessageStreamObserver = new ArrayList<>(2);

    @Override public StreamObserver<DoubleWayStream.RequestMessage> doubleWayStreamFun(
        StreamObserver<DoubleWayStream.ResponseMessage> responseObserver) {
//        this.responseMessageStreamObserver = responseObserver;
        if (this.responseMessageStreamObserver.size() <= 2) {
            this.responseMessageStreamObserver.add(responseObserver);
        }

        return new StreamObserver<DoubleWayStream.RequestMessage>() {
            @Override public void onNext(DoubleWayStream.RequestMessage requestMessage) {
                System.out.println("收到客户端消息" + requestMessage.getReqMsg());
                responseObserver.onNext(DoubleWayStream.ResponseMessage.newBuilder().setRspMsg("hello client").build());
            }

            @Override public void onError(Throwable throwable) {
                throwable.fillInStackTrace();
            }

            @Override public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<DoubleWayStream.RequestMessage> doubleWayStreamFun2(
        StreamObserver<DoubleWayStream.ResponseMessage> responseObserver) {
        if (this.responseMessageStreamObserver.size() <= 2) {
            this.responseMessageStreamObserver.add(responseObserver);
        }
//            this.responseMessageStreamObserver = responseObserver;
            return new StreamObserver<DoubleWayStream.RequestMessage>() {
                @Override public void onNext(DoubleWayStream.RequestMessage requestMessage) {
                    System.out.println("收到客户端消息2" + requestMessage.getReqMsg());
                    responseObserver.onNext(DoubleWayStream.ResponseMessage.newBuilder().setRspMsg("hello client").build());
                }

                @Override public void onError(Throwable throwable) {
                    throwable.fillInStackTrace();
                }

                @Override public void onCompleted() {
                    responseObserver.onCompleted();
                }
            };
    }

    public List<StreamObserver<DoubleWayStream.ResponseMessage>> getResponseMessageStreamObserver() {
        return responseMessageStreamObserver;
    }
}
