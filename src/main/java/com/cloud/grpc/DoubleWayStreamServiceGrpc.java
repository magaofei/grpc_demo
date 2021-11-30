package com.cloud.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *双向流式
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: doubleWayStream.proto")
public final class DoubleWayStreamServiceGrpc {

  private DoubleWayStreamServiceGrpc() {}

  public static final String SERVICE_NAME = "com.cloud.grpc.DoubleWayStreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cloud.grpc.DoubleWayStream.RequestMessage,
      com.cloud.grpc.DoubleWayStream.ResponseMessage> getDoubleWayStreamFunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoubleWayStreamFun",
      requestType = com.cloud.grpc.DoubleWayStream.RequestMessage.class,
      responseType = com.cloud.grpc.DoubleWayStream.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.cloud.grpc.DoubleWayStream.RequestMessage,
      com.cloud.grpc.DoubleWayStream.ResponseMessage> getDoubleWayStreamFunMethod() {
    io.grpc.MethodDescriptor<com.cloud.grpc.DoubleWayStream.RequestMessage, com.cloud.grpc.DoubleWayStream.ResponseMessage> getDoubleWayStreamFunMethod;
    if ((getDoubleWayStreamFunMethod = DoubleWayStreamServiceGrpc.getDoubleWayStreamFunMethod) == null) {
      synchronized (DoubleWayStreamServiceGrpc.class) {
        if ((getDoubleWayStreamFunMethod = DoubleWayStreamServiceGrpc.getDoubleWayStreamFunMethod) == null) {
          DoubleWayStreamServiceGrpc.getDoubleWayStreamFunMethod = getDoubleWayStreamFunMethod =
              io.grpc.MethodDescriptor.<com.cloud.grpc.DoubleWayStream.RequestMessage, com.cloud.grpc.DoubleWayStream.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoubleWayStreamFun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.grpc.DoubleWayStream.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.grpc.DoubleWayStream.ResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new DoubleWayStreamServiceMethodDescriptorSupplier("DoubleWayStreamFun"))
              .build();
        }
      }
    }
    return getDoubleWayStreamFunMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoubleWayStreamServiceStub newStub(io.grpc.Channel channel) {
    return new DoubleWayStreamServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoubleWayStreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DoubleWayStreamServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DoubleWayStreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DoubleWayStreamServiceFutureStub(channel);
  }

  /**
   * <pre>
   *双向流式
   * </pre>
   */
  public static abstract class DoubleWayStreamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.cloud.grpc.DoubleWayStream.RequestMessage> doubleWayStreamFun(
        io.grpc.stub.StreamObserver<com.cloud.grpc.DoubleWayStream.ResponseMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getDoubleWayStreamFunMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoubleWayStreamFunMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.cloud.grpc.DoubleWayStream.RequestMessage,
                com.cloud.grpc.DoubleWayStream.ResponseMessage>(
                  this, METHODID_DOUBLE_WAY_STREAM_FUN)))
          .build();
    }
  }

  /**
   * <pre>
   *双向流式
   * </pre>
   */
  public static final class DoubleWayStreamServiceStub extends io.grpc.stub.AbstractStub<DoubleWayStreamServiceStub> {
    private DoubleWayStreamServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoubleWayStreamServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoubleWayStreamServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoubleWayStreamServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.cloud.grpc.DoubleWayStream.RequestMessage> doubleWayStreamFun(
        io.grpc.stub.StreamObserver<com.cloud.grpc.DoubleWayStream.ResponseMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDoubleWayStreamFunMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *双向流式
   * </pre>
   */
  public static final class DoubleWayStreamServiceBlockingStub extends io.grpc.stub.AbstractStub<DoubleWayStreamServiceBlockingStub> {
    private DoubleWayStreamServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoubleWayStreamServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoubleWayStreamServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoubleWayStreamServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *双向流式
   * </pre>
   */
  public static final class DoubleWayStreamServiceFutureStub extends io.grpc.stub.AbstractStub<DoubleWayStreamServiceFutureStub> {
    private DoubleWayStreamServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoubleWayStreamServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoubleWayStreamServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoubleWayStreamServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DOUBLE_WAY_STREAM_FUN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DoubleWayStreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DoubleWayStreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DOUBLE_WAY_STREAM_FUN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.doubleWayStreamFun(
              (io.grpc.stub.StreamObserver<com.cloud.grpc.DoubleWayStream.ResponseMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DoubleWayStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoubleWayStreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cloud.grpc.DoubleWayStream.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DoubleWayStreamService");
    }
  }

  private static final class DoubleWayStreamServiceFileDescriptorSupplier
      extends DoubleWayStreamServiceBaseDescriptorSupplier {
    DoubleWayStreamServiceFileDescriptorSupplier() {}
  }

  private static final class DoubleWayStreamServiceMethodDescriptorSupplier
      extends DoubleWayStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DoubleWayStreamServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DoubleWayStreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoubleWayStreamServiceFileDescriptorSupplier())
              .addMethod(getDoubleWayStreamFunMethod())
              .build();
        }
      }
    }
    return result;
  }
}
