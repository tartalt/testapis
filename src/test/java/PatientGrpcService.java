import com.spring.patientmanagementservice.entities.Patient;
import com.spring.patientmanagementservice.mappers.PatientMapper;
import com.spring.patientmanagementservice.repositories.PatientRepository;
import emsi.ace.patientmanagementservice.stub.PatientServiceGrpc;
import emsi.ace.patientmanagementservice.stub.PatientServiceOuterClass;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientGrpcService extends PatientServiceGrpc.PatientServiceImplBase {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientMapper patientMapper;


    @Override
    public void getAllPatients(PatientServiceOuterClass.GetAllPatientsRequest request, StreamObserver<PatientServiceOuterClass.GetAllPatientsRequest> responseObserver ){
            List<Patient> patientlist = patientRepository.findAll();
    List<PatientServiceOuterClass.Patient> grpcPatients = patientlist.stream()
                                       .map(patientMapper::fromPatientEntityToPatientGrpc).collect(Collectors.toList());
    PatientServiceOuterClass.GetAllPatientsRequest patientsResponse=
            PatientServiceOuterClass.GetAllPatientsResponse.newBuilder()
                    .addAllPatients(grpcPatients)
                    .build();
    }

    @Override
    public void getPatientById(PatientServiceOuterClass.GetPatientByIdRequest request, StreanObserver<PatientServiceOuterClass.GetPatientRequest> responseObserver){
            Patient patientEntity=patientRepository.findById(request.getPatientId()).get();
    PatientServiceOuterClass.GetPatientByIdResponse response=
            PatientServiceOuterClass.GetPatientByIdResponse.newBuilder()
                    .setPatient(patientMapper.fromPatientEntityToPatientGrpc(patientEntity))
                    .build();
        responseObserver.onNext(response);
    }


    @Override
    public void savePatient(PatientServiceOuterClass.SavePatientRequest request, StreamObserver<PatientServiceOuterClass.SavePatientRequest> responseObserver) {
        PatientServiceOuterClass.PatientRequest patientRequest = request.getPatient();
    /*Patient patient=patientMapper.fromGrpcPatientRequestToPatientEntity(patientRequest);
    Patient savedPatient = patientRepository.save(patient);
    PatientServiceOuterClass.SavePatientRequest response=
            PatientServiceOuterClass.SavePatientRequest.newBuilder()
                    .setPatient(patientMapper.fromPatientEntityToPatientGrpc(savedPatient))
                    .build();
            responseObserver.onNext(response);
    responseObserver.onCompleted();*/
    }}
