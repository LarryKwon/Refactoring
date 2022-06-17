package ch04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileReaderTest {

    FileReader _input;
    FileReader _empty;

    @BeforeEach()
    public void setup() throws IOException {
        String path = System.getProperty("user.dir");
        System.out.println("Working Directory = " + path);
        _input = new FileReader("./test/ch04/data.txt");
        _empty = newEmptyFile();
    }

    @AfterEach()
    public void tearDown() {
        try {
            _input.close();
        } catch (IOException e) {
            throw new RuntimeException("테스트 파일을 닫는 중 에러 발생");
        }
    }

    private FileReader newEmptyFile() throws IOException {
        File empty = new File("empty.txt");
        FileOutputStream out = new FileOutputStream(empty);
        out.close();
        return new FileReader(empty);
    }

    @Test()
    public void testRead() throws IOException {
        char ch = '&';
        for (int i = 0; i < 4; i++) {
            ch = (char) _input.read();
        }
        assertThat(ch).isEqualTo('d');
    }

    @Test()
    public void testReadAtEnd() throws IOException {
        int ch = -1234;
        for (int i = 0; i < 202; i++) {
            ch = _input.read();
        }
        assertThat(_input.read()).isEqualTo(-1);
    }

    @Test()
    public void testReadBoundaries() throws IOException {
        assertThat(_input.read()).isEqualTo('B');
        int ch;
        for(int i=1; i<201; i++){
            ch = _input.read();
        }
        assertThat(_input.read()).as("read last char").isEqualTo('6');
        assertThat(_input.read()).as("read at end").isEqualTo(-1);
        assertThat(_input.read()).as("read past end").isEqualTo(-1);
    }

    @Test()
    public void testEmptyRead() throws IOException{
        assertThat(_empty.read()).isEqualTo(-1);
    }

    @Test()
    public void testReadAfterClose() throws IOException {
        _input.close();
        assertThatThrownBy(()->_input.read()).isInstanceOf(IOException.class);
    }
}
