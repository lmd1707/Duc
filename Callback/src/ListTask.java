import java.util.ArrayList;
import java.util.List;

public class ListTask implements AsyncTask<List> {
    private List<String> list;

    public ListTask(List<String> list) {
        this.list = list;
    }

    @Override
    public List execute() throws Exception {
        System.err.println("ListTask is running : ");
        Thread.sleep(5000);
        System.err.println("ListTask is finished : ");
        return new ArrayList(list);

    }


}
