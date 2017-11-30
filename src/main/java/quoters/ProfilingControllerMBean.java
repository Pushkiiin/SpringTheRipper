package quoters;

public interface ProfilingControllerMBean { //here we introduce methods we want to have access to from jmx-console
    void setEnabled(boolean enabled);
}
