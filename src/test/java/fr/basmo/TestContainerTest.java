package fr.basmo;

//@Testcontainers
public class TestContainerTest {
    /*

    private RedisBackedCache underTest;

    // container {
    @Container
    public GenericContainer redis = new GenericContainer(DockerImageName.parse("redis:6-alpine"))
            .withExposedPorts(6379);

    // }

    @BeforeEach
    public void setUp() {
        String address = redis.getHost();
        Integer port = redis.getFirstMappedPort();

        // Now we have an address and port for Redis, no matter where it is running
        underTest = new RedisBackedCache(address, port);
    }

    @Test
    public void testSimplePutAndGet() {
        underTest.put("test", "example");

        String retrieved = underTest.get("test");
        Assertions.assertEquals(retrieved, "example");
    }
     */
}
