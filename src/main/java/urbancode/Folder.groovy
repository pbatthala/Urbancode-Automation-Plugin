/*
* Licensed Materials - Property of IBM Corp.
* IBM UrbanCode Build
* IBM UrbanCode Deploy
* IBM UrbanCode Release
* IBM AnthillPro
* (c) Copyright IBM Corporation 2002, 2013. All Rights Reserved.
*
* U.S. Government Users Restricted Rights - Use, duplication or disclosure restricted by
* GSA ADP Schedule Contract with IBM Corp.
*/
package main.java.urbancode

class Folder {
    def id
    def name
    def parentId
    def Map<String, Folder> children = new HashMap<String, Folder>()
    
    public Folder(id, name, parentId) {
        this.id = id
        this.name = name
        this.parentId = parentId
    }

    public boolean equals(Object o) {
        if (o instanceof Folder && o != null) {
            return id.equals(o.id)
        }
        else {
            return false
        }
    }
	
	int hashCode()
	{
		return 0
	}

    public String toString() {
        return "[id:$id, name:$name, parent:$parentId, children:${children.keySet()}]"
    }
}

