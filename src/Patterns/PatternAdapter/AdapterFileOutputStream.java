package Patterns.PatternAdapter;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {

    private FileOutputStream ref;

    public AdapterFileOutputStream(FileOutputStream ref)
    {
        this.ref = ref;
    }

    @Override
    public void flush() throws IOException
    {
        ref.flush();
    }

    @Override
    public void writeString(String s) throws IOException
    {
        ref.write(s.getBytes());
    }

    @Override
    public void close() throws IOException
    {
        ref.close();
    }
}