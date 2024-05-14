import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Double> results = new ArrayList<>();

    public List<Double> getResults() {
        return results;
    }
    //setter

    public void setResults(List<Double> results) {
       this.results = results;
    }
    //results 리스트의 0번째 인덱스 삭제 기능 구현
    public void removeResult(int index){
        this.results.remove(index);
    }
}

