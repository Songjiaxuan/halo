package run.halo.app.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * URI test.
 *
 * @author johnniang
 * @date 3/26/19
 */
@Slf4j
public class URITest {

    @Test
    public void createURITest() throws URISyntaxException {
        String homeDir = System.getProperty("user.home");
        URI uri = new URI(homeDir);
        log.debug("[{}]", uri);
    }
}
