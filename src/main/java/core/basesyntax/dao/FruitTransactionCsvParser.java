package core.basesyntax.dao;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface FruitTransactionCsvParser {
    List<FruitTransaction> parse(String fileName);
}