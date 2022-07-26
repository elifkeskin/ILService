package com.ILService.Repository;



import com.ILService.Model.IL;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ILRepository extends MongoRepository<IL, String> {

}
