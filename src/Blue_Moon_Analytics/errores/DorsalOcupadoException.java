package Blue_Moon_Analytics.errores;

import java.io.UncheckedIOException;

public class DorsalOcupadoException extends RuntimeException {

    public DorsalOcupadoException() {
    }

    public DorsalOcupadoException(String message) {
        super(message);
    }
}
