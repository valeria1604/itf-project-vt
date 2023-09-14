package com.company.Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {
    public Integer getOptionalValue(int randomNumber) {
        Optional<Integer> optional = generateRandomOptional(randomNumber);
        return optional.orElseThrow(NoSuchElementException::new);
    }

    public Optional<Integer> generateRandomOptional(int randomNumber) {
        if (randomNumber % 2 == 0) {
            return Optional.empty();
        }
        return Optional.of(randomNumber);
    }
}

