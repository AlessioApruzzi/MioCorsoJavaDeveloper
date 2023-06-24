package esercizi.multimappa_generica;

import lombok.Getter;

import javax.swing.plaf.PanelUI;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Getter
public class MultiMappa<K, V> {
    private Map<K, List<V>> map;

    public MultiMappa() {
        map = new HashMap<>();
    }
    public MultiMappa(Map map){
        this.map=map;
    }

    public void put(K k ,V v){

        if (map.putIfAbsent(k,Arrays.asList(v)) != null){
            map.get(k).add(v);
        }
    }

    public void puttAll(MultiMappa<K,V> newMap){

        map.putAll(newMap.getMap());
    }

    public void removeAll(MultiMappa<K,V> newMap) {

        map.keySet().removeAll(newMap.getMap().keySet());
    }

    public List<V> get(K k){

        return map.get(k);
    }

    public List<V> get(K k, Predicate<V> p){
        return map.get(k).stream().filter(p).collect(Collectors.toList());
    }

    public List<V> values() {
        // return map.values().stream().toList().stream().reduce(null, (List<V> v1,List<V> v2) -> v1.addAll(v2));
        return map.values().stream().flatMap(List::stream).toList();
    }

    public Set<V> valuesSet() {
        // return map.values().stream().toList().stream().reduce(null, (List<V> v1,List<V> v2) -> v1.addAll(v2));
        return map.values().stream().flatMap(List::stream).collect(Collectors.toSet());
    }

    public <Z> MultiMappa<K,Z> trasformaMultimappa(Function<List<V>,List<Z>> f){

        return new MultiMappa<>( map.entrySet()
                .stream()
                .collect(Collectors
                        .toMap(
                                Map.Entry::getKey,
                                s -> f.apply(s.getValue())
                        )));
    }

    public void mapEach(Function<List<V>,List<V>> f){
        trasformaMultimappa(f);
    }

}