package customfunction;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "Custom Functions", prefix = "tib", namespace = "http://tech.compilation.custom.function", helpText = "Custom defined function")
public class CustomFunctions {

	@XPathFunction(helpText = "Description", parameters = {
			@XPathFunctionParameter(name = "inputstring", optional = true, optionalValue = ""),
			@XPathFunctionParameter(name = "findstring", optional = true, optionalValue = ""),
			@XPathFunctionParameter(name = "replacedbystring", optional = true, optionalValue = "") })
	public String replaceAll(String inputstring, String findstring,
			String replacedbystring) {
		return null;
	}
}
