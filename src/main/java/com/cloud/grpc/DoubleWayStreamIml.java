package com.cloud.grpc;

import io.grpc.stub.StreamObserver;

public class DoubleWayStreamIml extends DoubleWayStreamServiceGrpc.DoubleWayStreamServiceImplBase {

    private StreamObserver<DoubleWayStream.ResponseMessage> responseMessageStreamObserver;

    @Override public StreamObserver<DoubleWayStream.RequestMessage> doubleWayStreamFun(
        StreamObserver<DoubleWayStream.ResponseMessage> responseObserver) {
        this.responseMessageStreamObserver = responseObserver;
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

    public StreamObserver<DoubleWayStream.ResponseMessage> getResponseMessageStreamObserver() {
        return responseMessageStreamObserver;
    }
}
