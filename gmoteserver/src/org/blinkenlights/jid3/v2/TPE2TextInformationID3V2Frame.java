/*
 * TPE2TextInformationID3V2Frame.java
 *
 * Created on 9-Jan-2004
 *
 * Copyright (C)2004-2005 Paul Grebenc
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * $Id: TPE2TextInformationID3V2Frame.java,v 1.8 2005/02/06 18:11:23 paul Exp $
 */

package org.blinkenlights.jid3.v2;

import java.io.*;

import org.blinkenlights.jid3.*;
import org.blinkenlights.jid3.io.*;
import org.blinkenlights.jid3.util.*;

/**
 * @author paul
 *
 * Text frame containing the band, orchestral or accompaniment in the recording in this track.
 */
public class TPE2TextInformationID3V2Frame extends TextInformationID3V2Frame
{
    private String m_sBandOrchestralAccompaniment = null;
    
    /** Constructor.
     *
     * @param sBandOrchestraAccompaniment the band, orchestra or accompaniment in the recording in this track
     */
    public TPE2TextInformationID3V2Frame(String sBandOrchestraAccompaniment)
    {
        super(sBandOrchestraAccompaniment);
        
        m_sBandOrchestralAccompaniment = sBandOrchestraAccompaniment;
    }

    public TPE2TextInformationID3V2Frame(InputStream oIS)
        throws ID3Exception
    {
        super(oIS);
        
        m_sBandOrchestralAccompaniment = m_sInformation;
    }

    public void accept(ID3Visitor oID3Visitor)
    {
        oID3Visitor.visitTPE2TextInformationID3V2Frame(this);
    }

    /** Set the band, orchestra or accompaniment in the recording in this track.
     *
     * @param sBandOrchestraAccompaniment the band, orchestra or accompaniment in the recording in this track
     */
    public void setBandOrchestraAccompaniment(String sBandOrchestraAccompaniment)
    {
        m_sBandOrchestralAccompaniment = sBandOrchestraAccompaniment;
        m_oTextEncoding = TextEncoding.getDefaultTextEncoding();
        m_sInformation = sBandOrchestraAccompaniment;
    }
    
    /** Get the band, orchestra or accompaniment in the recording in this track.
     *
     * @return the band, orchestra or accompaniment in the recording in this track
     */
    public String getBandOrchestraAccompaniment()
    {
        return m_sBandOrchestralAccompaniment;
    }
    
    protected byte[] getFrameId()
    {
        return "TPE2".getBytes();
    }
    
    public String toString()
    {
        return "Band/Orchestra/Accompaniment: [" + m_sInformation + "]";
    }
    
    public boolean equals(Object oOther)
    {
        if ((oOther == null) || (!(oOther instanceof TPE2TextInformationID3V2Frame)))
        {
            return false;
        }
        
        TPE2TextInformationID3V2Frame oOtherTPE2 = (TPE2TextInformationID3V2Frame)oOther;
        
        return (m_sBandOrchestralAccompaniment.equals(oOtherTPE2.m_sBandOrchestralAccompaniment) &&
                m_oTextEncoding.equals(oOtherTPE2.m_oTextEncoding) &&
                m_sInformation.equals(oOtherTPE2.m_sInformation));
    }
}
