Vimos na aula a classe java.util.Vector em ação, mas a API de Collections possuem muito mais interfaces e implementações.

Dentro dessa API existem 4 interfaces principais: java.util.Collection, java.util.List, java.util.Set e java.util.Map.


Se a classe Vector é a versão thread-safe de uma lista, será que existem para as outras interfaces implementações thread-safe? Claro que sim!

Para os mapas (Map) podemos usar a antiga classe Hashtable:
```
Map mapaThreadSafe = new Hashtable();
```

E também temos uma implementação mais recente e performática de mapas, a classe ConcurrentHashMap:
```
//do pacote java.util.concurrent
Map mapaThreadSafe = new ConcurrentHashMap();
```

Para o Set (conjunto) não existe uma implementação pronta na API padrão do Java mas podemos utilizar a classe Collections para construir um Set sincronizado:
```
Set conjunto = Collections.synchronizedSet(new HashSet());
```

Interface se chama de java.util.Queue (Queue == fila).
A implementação não thread-safe da fila é a LinkedList (sim, uma LinkedList é uma lista e também é uma fila!). As versões thread-safe são as classes *BlockingQueue, por exemplo ArrayBlockingQueue.