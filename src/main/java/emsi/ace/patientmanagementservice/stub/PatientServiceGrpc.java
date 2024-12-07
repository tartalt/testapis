package emsi.ace.patientmanagementservice.stub;

import io.grpc.stub.StreamObserver;

import java.util.stream.Stream;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: PatientService.proto")
public final class PatientServiceGrpc {

  private PatientServiceGrpc() {}

  public static final String SERVICE_NAME = "com.spring.patientmanagementservice.grpc.PatientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest,
      emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest> getGetAllPatientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllPatients",
      requestType = emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest.class,
      responseType = emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest,
      emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest> getGetAllPatientsMethod() {
    io.grpc.MethodDescriptor<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest, emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest> getGetAllPatientsMethod;
    if ((getGetAllPatientsMethod = PatientServiceGrpc.getGetAllPatientsMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetAllPatientsMethod = PatientServiceGrpc.getGetAllPatientsMethod) == null) {
          PatientServiceGrpc.getGetAllPatientsMethod = getGetAllPatientsMethod = 
              io.grpc.MethodDescriptor.<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest, emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.spring.patientmanagementservice.grpc.PatientService", "getAllPatients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("getAllPatients"))
                  .build();
          }
        }
     }
     return getGetAllPatientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest,
      emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest> getGetPatientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPatientById",
      requestType = emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest.class,
      responseType = emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest,
      emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest> getGetPatientByIdMethod() {
    io.grpc.MethodDescriptor<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest, emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest> getGetPatientByIdMethod;
    if ((getGetPatientByIdMethod = PatientServiceGrpc.getGetPatientByIdMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetPatientByIdMethod = PatientServiceGrpc.getGetPatientByIdMethod) == null) {
          PatientServiceGrpc.getGetPatientByIdMethod = getGetPatientByIdMethod = 
              io.grpc.MethodDescriptor.<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest, emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.spring.patientmanagementservice.grpc.PatientService", "getPatientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("getPatientById"))
                  .build();
          }
        }
     }
     return getGetPatientByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest,
      emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest> getSavePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "savePatient",
      requestType = emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest.class,
      responseType = emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest,
      emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest> getSavePatientMethod() {
    io.grpc.MethodDescriptor<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest, emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest> getSavePatientMethod;
    if ((getSavePatientMethod = PatientServiceGrpc.getSavePatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getSavePatientMethod = PatientServiceGrpc.getSavePatientMethod) == null) {
          PatientServiceGrpc.getSavePatientMethod = getSavePatientMethod = 
              io.grpc.MethodDescriptor.<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest, emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.spring.patientmanagementservice.grpc.PatientService", "savePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("savePatient"))
                  .build();
          }
        }
     }
     return getSavePatientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientServiceStub newStub(io.grpc.Channel channel) {
    return new PatientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PatientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PatientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PatientServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Définir la méthode RPC pour obtenir un patient par son ID
     * </pre>
     */
    public void getAllPatients(emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest request,
        io.grpc.stub.StreamObserver<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllPatientsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Définir la méthode RPC pour créer un patient
     * </pre>
     */
    public void getPatientById(com.spring.patientmanagementservice.stubs.PatientServiceOuterClass.GetPatientByIdRequest request,
        io.grpc.stub.StreamObserver<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPatientByIdMethod(), responseObserver);
    }

    /**
     */
    public void savePatient(emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest request,
        io.grpc.stub.StreamObserver<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getSavePatientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllPatientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest,
                emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest>(
                  this, METHODID_GET_ALL_PATIENTS)))
          .addMethod(
            getGetPatientByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest,
                emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest>(
                  this, METHODID_GET_PATIENT_BY_ID)))
          .addMethod(
            getSavePatientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest,
                emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest>(
                  this, METHODID_SAVE_PATIENT)))
          .build();
    }

    public abstract void getPatientById(PatientServiceOuterClass.GetPatientByIdRequest request,   StreamObserver<PatientServiceOuterClass.GetPatientByIdRequest> responseObserver);
  }

  /**
   */
  public static final class PatientServiceStub extends io.grpc.stub.AbstractStub<PatientServiceStub> {
    private PatientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Définir la méthode RPC pour obtenir un patient par son ID
     * </pre>
     */
    public void getAllPatients(emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest request,
        io.grpc.stub.StreamObserver<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Définir la méthode RPC pour créer un patient
     * </pre>
     */
    public void getPatientById(emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest request,
        io.grpc.stub.StreamObserver<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPatientByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void savePatient(emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest request,
        io.grpc.stub.StreamObserver<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSavePatientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientServiceBlockingStub extends io.grpc.stub.AbstractStub<PatientServiceBlockingStub> {
    private PatientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Définir la méthode RPC pour obtenir un patient par son ID
     * </pre>
     */
    public emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest getAllPatients(emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllPatientsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Définir la méthode RPC pour créer un patient
     * </pre>
     */
    public emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest getPatientById(emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPatientByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest savePatient(emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest request) {
      return blockingUnaryCall(
          getChannel(), getSavePatientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientServiceFutureStub extends io.grpc.stub.AbstractStub<PatientServiceFutureStub> {
    private PatientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Définir la méthode RPC pour obtenir un patient par son ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest> getAllPatients(
        emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Définir la méthode RPC pour créer un patient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest> getPatientById(
        emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPatientByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest> savePatient(
        emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSavePatientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PATIENTS = 0;
  private static final int METHODID_GET_PATIENT_BY_ID = 1;
  private static final int METHODID_SAVE_PATIENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_PATIENTS:
          serviceImpl.getAllPatients((emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest) request,
              (io.grpc.stub.StreamObserver<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetAllPatientsRequest>) responseObserver);
          break;
        case METHODID_GET_PATIENT_BY_ID:
          serviceImpl.getPatientById((emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest) request,
              (io.grpc.stub.StreamObserver<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.GetPatientByIdRequest>) responseObserver);
          break;
        case METHODID_SAVE_PATIENT:
          serviceImpl.savePatient((emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest) request,
              (io.grpc.stub.StreamObserver<emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.SavePatientRequest>) responseObserver);
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

  private static abstract class PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientService");
    }
  }

  private static final class PatientServiceFileDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier {
    PatientServiceFileDescriptorSupplier() {}
  }

  private static final class PatientServiceMethodDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientServiceFileDescriptorSupplier())
              .addMethod(getGetAllPatientsMethod())
              .addMethod(getGetPatientByIdMethod())
              .addMethod(getSavePatientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
