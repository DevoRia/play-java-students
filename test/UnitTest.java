import akka.actor.ActorSystem;
import com.google.inject.Guice;
import models.Student;
import org.junit.Before;
import org.junit.Test;
import play.Application;
import play.Environment;
import play.api.ApplicationLoader;
import play.core.server.ServerProvider;
import play.inject.guice.GuiceApplicationBuilder;
import play.inject.guice.GuiceApplicationLoader;
import play.mvc.Result;
import play.test.Helpers;
import repositories.StudentRepo;
import scala.concurrent.ExecutionContextExecutor;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static play.test.Helpers.contentAsString;

/**
 * Unit testing does not require Play application start up.
 *
 * https://www.playframework.com/documentation/latest/JavaTest
 */
public class UnitTest {

    @Inject
    StudentRepo repo;


    @Before
    public void setup() {
        Helpers.start((Application) repo);
    }

    @Test
    public void repoTest(){
        assertThat(repo);
    }

    @Test
    public void findAllCheck() {
        List list = repo.findAll();
        System.out.println(list.toString());
        assertThat(list.get(0)).isInstanceOf(Student.class);
        assertThat(list);
    }

}
