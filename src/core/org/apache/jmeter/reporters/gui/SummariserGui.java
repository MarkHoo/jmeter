// $Header$
/*
 * Copyright 2003-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/

package org.apache.jmeter.reporters.gui;

import java.awt.BorderLayout;

import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.processor.gui.AbstractPostProcessorGui;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.util.JMeterUtils;

/**
 * Create a summariser test element.
 * 
 * Note:
 * This is not really a PostProcessor, but that seems to be the closest
 * of the existing types.
 * 
 * @author sebb AT apache DOT org
 * @version $Revision$ Last updated: $date$
 */
public class SummariserGui extends AbstractPostProcessorGui
{
   
    public SummariserGui()
    {
        super();
        init();
    }

    /**
     * @see org.apache.jmeter.gui.JMeterGUIComponent#getStaticLabel()
     */
    public String getStaticLabel()
    {
        return JMeterUtils.getResString("summariser_title");
    }
    
    public void configure(TestElement el)
    {
        super.configure(el);
    }

    /**
     * @see org.apache.jmeter.gui.JMeterGUIComponent#createTestElement()
     */
    public TestElement createTestElement()
    {
        Summariser summariser = new Summariser();
        modifyTestElement(summariser);
        return summariser;
    }

    /**
     * Modifies a given TestElement to mirror the data in the gui components.
     * @see org.apache.jmeter.gui.JMeterGUIComponent#modifyTestElement(TestElement)
     */
    public void modifyTestElement(TestElement summariser)
    {
        super.configureTestElement(summariser);
    }
    
    private void init()
    {
        setLayout(new BorderLayout());
        setBorder(makeBorder());
        
        add(makeTitlePanel(),BorderLayout.NORTH);
    }
}
