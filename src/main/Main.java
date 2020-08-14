package main;

import service.IEmploye;
import service.IService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) throws Exception{
        Registry registry = LocateRegistry.getRegistry(5002);
        IService iService = (IService)registry.lookup("serviceRemote");
        iService.findAll();
        IEmploye iEmploye = (IEmploye)registry.lookup("employeRemote");
        iEmploye.add(null);
        iEmploye.findAll();
        iEmploye.findAllByService(0);

    }
}
