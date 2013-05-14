package darwin.common.math.nodeType;

import darwin.problemObject.NodeType;
import darwin.problemObject.Processable;

public class Divide extends NodeType {

	@Override
	public Class<?>[] getChildTypes() {
		return new Class<?>[] {Double.class, Double.class};
	}

	@Override
	public Processable<?> getProcessable() {
		return new darwin.common.math.processable.Divide();
	}

	@Override
	public Class<?> getReturnType() {
		return Double.class;
	}

}
