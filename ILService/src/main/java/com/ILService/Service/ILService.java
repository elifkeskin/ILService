
package com.ILService.Service;

import com.ILService.Model.IL;
import com.ILService.Repository.ILRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ILService {

    private final ILRepository ilRepository;
    public List<IL> getIller() {

        return ilRepository.findAll();
    }

    public IL createIl(IL newIl) {

        return ilRepository.save(newIl);
    }

    public void deleteIl(String id) {

        ilRepository.deleteById(id);
    }

    public IL getIlById(String id) {
        return ilRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("IL not found"));
    }

    public void updateIl(String id, IL newIl) {
     IL oldIl=getIlById(id);
     oldIl.setName(newIl.getName());
     ilRepository.save(oldIl);
    }
}
