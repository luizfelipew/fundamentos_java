package refactors;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperatorFactory {
    static Map<String, Operation> operationMap = new HashMap();
    static {
        operationMap.put("add", new Addition());
        operationMap.put("subtract", new Subtracting());
        operationMap.put("multiply", new Multiplying());
        operationMap.put("divide", new Dividing());
    }

    public static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}
