
package test.sequence.simple;

import iocworkflow.BaseActivity;
import iocworkflow.ProcessContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Class:Activity1 Creation Date: Mar 7, 2005 CVS ID $Id:$
 * 
 * Class Descriptoin goes here
 * 
 * @author sdodge
 * @since $Date:$
 */
public class Activity1 extends BaseActivity {

    private Log log = LogFactory.getLog(Activity1.class);

    /*
     * (non-Javadoc)
     * 
     * @see org.iocworkflow.Activity#execute(org.iocworkflow.ProcessContext)
     */

    @Override
    public ProcessContext execute(ProcessContext context) throws Exception {
        log.info("EXECUTE Activity1");

        SimpleContext simpleContext = (SimpleContext) context;
        simpleContext.getWorkflowData().add("Data from Activity1");

        return (ProcessContext) simpleContext;
    }

}