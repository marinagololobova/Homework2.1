package transport;

import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transportQueue;

    public ServiceStation(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public Queue<Transport> getTransportQueue() {
        return transportQueue;
    }

    public void setTransportQueue(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public void addCarToTheQueue(Transport transport) {
        if (transport.checkAddingQueueServiceStation())
            transportQueue.add(transport);

    }

    public void carryOutTechnicalInspectionCar() {
        if (!transportQueue.isEmpty()) {
            Transport transport = transportQueue.poll();
            transport.repair();
        }

    }

    public void carryOutMaintenance(Queue<Transport> transportQueue) {
        if (transportQueue.isEmpty()) {
            System.out.println("Механик отсутствует");
        } else {
            while (!transportQueue.isEmpty()) {
                Transport actualTransport = transportQueue.poll();
                List<Mechanic> mechanicList = actualTransport.getMechanicsList();
                for (Mechanic m : mechanicList) {
                    m.performMaintenance();
                }
            }
        }
    }
}
