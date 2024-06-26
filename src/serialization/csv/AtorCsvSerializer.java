package serialization.csv;

import entities.Ator;

public class AtorCsvSerializer implements CsvSerializer<Ator> {

    private final String delimiter;

    public AtorCsvSerializer(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String serialize(Ator entity) {
        return String.join(delimiter, entity.getNome(), entity.getCpf());
    }

    @Override
    public Ator deserialize(String serializedEntity) {
        String[] fields = serializedEntity.split(delimiter);
        String nome = fields[0];
        String cpf = fields[1];
        return new Ator(nome, cpf);
    }
}
