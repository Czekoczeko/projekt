import java.util.List;
/**
 *adapter wyj�ciowy
 */
public abstract interface OutputAdapter {
	public abstract void setupConfig(Configuration configuration);
	public abstract boolean storeEvents(List<Event> list);
}
