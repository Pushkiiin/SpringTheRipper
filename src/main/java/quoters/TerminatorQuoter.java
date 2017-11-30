package quoters;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter{
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    @PostConstruct
    public void init(){
        System.out.println("Phase 2 (init-method)");
        System.out.println(repeat);
    }

    public TerminatorQuoter(){
        System.out.println("Phase 1 (Constructor)");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3 (post-proxy)");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
