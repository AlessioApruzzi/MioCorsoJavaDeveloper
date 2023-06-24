package esercizi.elenco_di_routine;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Getter
public class ElencoDiRoutine {

    List<Function<String,Integer>> list;
    ElencoDiRoutine(List<Function<String,Integer>> list){
        this.list=list;
    }

    public void esegui(String str){
        for (Function<String, Integer> stringIntegerFunction : list) {
            System.out.println(stringIntegerFunction.apply(str));
        }
    }

    public static void main(String[] args) {


        Function<String,Integer> f1 = String::length;  //s -> s.length()
        Function<String,Integer> f2 = s -> Integer.parseInt(String.valueOf(s.chars().filter(c -> c == 'y').count()));
        Function<String,Integer> f3 = s -> s.chars().allMatch(Character::isDigit) ? Integer.parseInt(s) : null;
        Function<String,Integer> f4 = s -> s.chars().sum();
        Function<String,Integer> f41 = s -> s.chars()
                .boxed()
                .map(Character::getNumericValue)
                .reduce(Integer::sum)
                .get();


        List<Function<String,Integer>> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);

        ElencoDiRoutine elencoDiRoutine = new ElencoDiRoutine(list);
        System.out.println(elencoDiRoutine.getList());

        elencoDiRoutine.esegui("123");
        elencoDiRoutine.esegui("ciaoyy");

    }

}
