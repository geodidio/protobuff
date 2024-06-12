package com.acc.grpc;

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
 * Service define ...
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: protobuff.proto")
public final class CompanyServiceGrpc {

  private CompanyServiceGrpc() {}

  public static final String SERVICE_NAME = "CompanyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.acc.grpc.UserProto.CompanyRequest,
      com.acc.grpc.UserProto.Response> getGetTaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTax",
      requestType = com.acc.grpc.UserProto.CompanyRequest.class,
      responseType = com.acc.grpc.UserProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.acc.grpc.UserProto.CompanyRequest,
      com.acc.grpc.UserProto.Response> getGetTaxMethod() {
    io.grpc.MethodDescriptor<com.acc.grpc.UserProto.CompanyRequest, com.acc.grpc.UserProto.Response> getGetTaxMethod;
    if ((getGetTaxMethod = CompanyServiceGrpc.getGetTaxMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetTaxMethod = CompanyServiceGrpc.getGetTaxMethod) == null) {
          CompanyServiceGrpc.getGetTaxMethod = getGetTaxMethod = 
              io.grpc.MethodDescriptor.<com.acc.grpc.UserProto.CompanyRequest, com.acc.grpc.UserProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "GetTax"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.acc.grpc.UserProto.CompanyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.acc.grpc.UserProto.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("GetTax"))
                  .build();
          }
        }
     }
     return getGetTaxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.acc.grpc.UserProto.CreateCompanyRequest,
      com.acc.grpc.UserProto.Response> getCreateCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCompany",
      requestType = com.acc.grpc.UserProto.CreateCompanyRequest.class,
      responseType = com.acc.grpc.UserProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.acc.grpc.UserProto.CreateCompanyRequest,
      com.acc.grpc.UserProto.Response> getCreateCompanyMethod() {
    io.grpc.MethodDescriptor<com.acc.grpc.UserProto.CreateCompanyRequest, com.acc.grpc.UserProto.Response> getCreateCompanyMethod;
    if ((getCreateCompanyMethod = CompanyServiceGrpc.getCreateCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getCreateCompanyMethod = CompanyServiceGrpc.getCreateCompanyMethod) == null) {
          CompanyServiceGrpc.getCreateCompanyMethod = getCreateCompanyMethod = 
              io.grpc.MethodDescriptor.<com.acc.grpc.UserProto.CreateCompanyRequest, com.acc.grpc.UserProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "CreateCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.acc.grpc.UserProto.CreateCompanyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.acc.grpc.UserProto.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("CreateCompany"))
                  .build();
          }
        }
     }
     return getCreateCompanyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompanyServiceStub newStub(io.grpc.Channel channel) {
    return new CompanyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompanyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompanyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompanyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompanyServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service define ...
   * </pre>
   */
  public static abstract class CompanyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * method user to retrieve the tax he used ...
     * </pre>
     */
    public void getTax(com.acc.grpc.UserProto.CompanyRequest request,
        io.grpc.stub.StreamObserver<com.acc.grpc.UserProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaxMethod(), responseObserver);
    }

    /**
     * <pre>
     * method to create company
     * </pre>
     */
    public void createCompany(com.acc.grpc.UserProto.CreateCompanyRequest request,
        io.grpc.stub.StreamObserver<com.acc.grpc.UserProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCompanyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTaxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.acc.grpc.UserProto.CompanyRequest,
                com.acc.grpc.UserProto.Response>(
                  this, METHODID_GET_TAX)))
          .addMethod(
            getCreateCompanyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.acc.grpc.UserProto.CreateCompanyRequest,
                com.acc.grpc.UserProto.Response>(
                  this, METHODID_CREATE_COMPANY)))
          .build();
    }
  }

  /**
   * <pre>
   * Service define ...
   * </pre>
   */
  public static final class CompanyServiceStub extends io.grpc.stub.AbstractStub<CompanyServiceStub> {
    private CompanyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * method user to retrieve the tax he used ...
     * </pre>
     */
    public void getTax(com.acc.grpc.UserProto.CompanyRequest request,
        io.grpc.stub.StreamObserver<com.acc.grpc.UserProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * method to create company
     * </pre>
     */
    public void createCompany(com.acc.grpc.UserProto.CreateCompanyRequest request,
        io.grpc.stub.StreamObserver<com.acc.grpc.UserProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCompanyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service define ...
   * </pre>
   */
  public static final class CompanyServiceBlockingStub extends io.grpc.stub.AbstractStub<CompanyServiceBlockingStub> {
    private CompanyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * method user to retrieve the tax he used ...
     * </pre>
     */
    public com.acc.grpc.UserProto.Response getTax(com.acc.grpc.UserProto.CompanyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTaxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * method to create company
     * </pre>
     */
    public com.acc.grpc.UserProto.Response createCompany(com.acc.grpc.UserProto.CreateCompanyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCompanyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service define ...
   * </pre>
   */
  public static final class CompanyServiceFutureStub extends io.grpc.stub.AbstractStub<CompanyServiceFutureStub> {
    private CompanyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * method user to retrieve the tax he used ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.acc.grpc.UserProto.Response> getTax(
        com.acc.grpc.UserProto.CompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * method to create company
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.acc.grpc.UserProto.Response> createCompany(
        com.acc.grpc.UserProto.CreateCompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCompanyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TAX = 0;
  private static final int METHODID_CREATE_COMPANY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompanyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompanyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TAX:
          serviceImpl.getTax((com.acc.grpc.UserProto.CompanyRequest) request,
              (io.grpc.stub.StreamObserver<com.acc.grpc.UserProto.Response>) responseObserver);
          break;
        case METHODID_CREATE_COMPANY:
          serviceImpl.createCompany((com.acc.grpc.UserProto.CreateCompanyRequest) request,
              (io.grpc.stub.StreamObserver<com.acc.grpc.UserProto.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompanyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.acc.grpc.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompanyService");
    }
  }

  private static final class CompanyServiceFileDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier {
    CompanyServiceFileDescriptorSupplier() {}
  }

  private static final class CompanyServiceMethodDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompanyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CompanyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompanyServiceFileDescriptorSupplier())
              .addMethod(getGetTaxMethod())
              .addMethod(getCreateCompanyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
