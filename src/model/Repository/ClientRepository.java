package model.Repository;

import model.Client;

import java.io.IOException;
import java.util.Set;

public interface ClientRepository {
    void addClient(Client client) throws Exception;

    void deleteClient(int clientID) throws Exception;

    Client getClient(int clientID);

    Set<Client> getAllClients();

    Set<Client> getAllClientsPushOn();

    void updateClient(Client client) throws Exception;

    Set<Client> getAllClientsBirthday();

}
