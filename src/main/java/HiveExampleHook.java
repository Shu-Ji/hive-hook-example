import org.apache.hadoop.hive.ql.hooks.ExecuteWithHookContext;
import org.apache.hadoop.hive.ql.hooks.HookContext;

public class HiveExampleHook implements ExecuteWithHookContext {
    public void run(HookContext hookContext) throws Exception {
        System.out.println("Hello from the hook !!");
    }
}
