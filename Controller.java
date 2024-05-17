import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }

    public static void main(String[] args) {
        // Пример использования
        Group group1 = new Group("Group 1");
        Group group2 = new Group("Group 2");
        Group group3 = new Group("Group 3");

        Stream stream1 = new Stream(List.of(group1));
        Stream stream2 = new Stream(List.of(group1, group2));
        Stream stream3 = new Stream(List.of(group1, group2, group3));

        List<Stream> streams = new ArrayList<>(List.of(stream3, stream1, stream2));

        Controller controller = new Controller(new StreamService());
        System.out.println("До сортировки:");
        for (Stream stream : streams) {
            System.out.println(stream.getGroups().size());
        }

        controller.sortStreams(streams);

        System.out.println("После сортировки:");
        for (Stream stream : streams) {
            System.out.println(stream.getGroups().size());
        }
    }
}