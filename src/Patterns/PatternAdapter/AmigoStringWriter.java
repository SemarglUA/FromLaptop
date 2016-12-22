package Patterns.PatternAdapter;

import java.io.IOException;

public interface AmigoStringWriter {
    public void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}