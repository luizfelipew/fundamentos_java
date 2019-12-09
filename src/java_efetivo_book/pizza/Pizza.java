package java_efetivo_book.pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// padrao builder para hierarquia de classes
public abstract class Pizza {

    public enum Topping {
        HUM,
        MUSHROOM,
        ONION,
        PEPPER,
        SAUSAGE
    }

    final Set<Topping> toppings;

    abstract static class Builder< T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopings(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        protected abstract T self();

        abstract Pizza build();

        // as subclasses devem sobrescrever esse metodo para retornar
        // "essa classe protegida abstrata T;self()"
    }
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}
