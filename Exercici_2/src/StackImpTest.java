import java.util.EmptyStackException;
import java.util.logging.Logger;

public class StackImpTest {



    public static void main(String[] args) throws FullStackException {
        System.out.println("Test");
        Logger logger = Logger.getLogger(StackImpTest.class.getName());
        logger.info("hello");
        Stack<Integer> s = new StackImpl<Integer>(5);

        try {
            s.push(5);
            s.push(17);


            Stack<String> s2 = new StackImpl<String>(3);
            s2.push("hola");

            System.out.println(s.size());

            s.pop();
        }
        catch (EmptyStackException empty){
            empty.printStackTrace();
            }
            catch(FullStackException full)
            {
                //
            }
        finally {
                    //
                }
        }
    }

