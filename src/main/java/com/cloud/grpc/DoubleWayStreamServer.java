package com.cloud.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.Scanner;

public class DoubleWayStreamServer {

    public static void main(String[] args) {

        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(8899);
        DoubleWayStreamIml doubleWayStreamIml=new DoubleWayStreamIml();
        serverBuilder.addService(doubleWayStreamIml);
        Server server = serverBuilder.build();
        try {
            server.start();
            //开启线程向客户端输入
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Scanner scanner=new Scanner(System.in);
                    for (;true;){
                        String str=scanner.nextLine();
                        if(str.equals("EOF")){
                            break;
                        }
                        try {
                            doubleWayStreamIml.getResponseMessageStreamObserver().onNext(
                                DoubleWayStream.ResponseMessage.newBuilder().setRspMsg(str).build());
                        }catch (Exception e){
                            System.out.println("【异常】：没有客户端连接...");
                            //一般客户端链接失败就会断开
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
