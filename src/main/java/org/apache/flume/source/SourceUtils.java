/*
 * Copyright (C) 2015 Luis Lázaro <lalazaro@keedio.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.apache.flume.source;

import org.apache.flume.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


 @SuppressWarnings("FieldMayBeFinal")
 
/**
 * 
 * @author Luis Lázaro <lalazaro@keedio.com>
 */
public class SourceUtils {
   
    
    private static final Logger log = LoggerFactory.getLogger(SourceUtils.class);
    
    private String folder;
    private int runDiscoverDelay;
    
    public SourceUtils(Context context){
        folder = context.getString("name.folder");
        runDiscoverDelay = context.getInteger("run.discover.delay");
    }
    
    
    /*
    @return String, folder for files
    */
    public String getFolder(){
        return folder;
    }
    
    
    /*
    @void set folder for files
    */
    public void setFolder(String newFolder){
        folder = newFolder;
    }
    
    
    /*
    return int, ms till next pooll
    */
    public int getDelay(){
        return runDiscoverDelay;
    }

}
