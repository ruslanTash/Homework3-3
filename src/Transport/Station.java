package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class Station {
    private Queue<Transport<?>> queue;


    public Station(LinkedList<Transport<?>> queue) {
        this.queue = queue;
    }

    public Station() {
        queue = new LinkedList<Transport<?>>();
    }

    public void addInQueue(Transport transport) {
        queue.add(transport);
    }

    public void doMaintrance(Transport<?> transport) throws TransportTypeException {
        transport.passDiagnostic();
        queue.poll();
    }
}


