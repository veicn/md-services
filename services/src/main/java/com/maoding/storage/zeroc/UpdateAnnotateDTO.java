// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `StorageData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.storage.zeroc;

public class UpdateAnnotateDTO implements java.lang.Cloneable,
                                          java.io.Serializable
{
    public String statusId;

    public String getStatusId()
    {
        return statusId;
    }

    public void setStatusId(String statusId)
    {
        this.statusId = statusId;
    }

    public String content;

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String fileId;

    public String getFileId()
    {
        return fileId;
    }

    public void setFileId(String fileId)
    {
        this.fileId = fileId;
    }

    public String mainFileId;

    public String getMainFileId()
    {
        return mainFileId;
    }

    public void setMainFileId(String mainFileId)
    {
        this.mainFileId = mainFileId;
    }

    public java.util.List<java.lang.String> addElementIdList;

    public java.util.List<java.lang.String> getAddElementIdList()
    {
        return addElementIdList;
    }

    public void setAddElementIdList(java.util.List<java.lang.String> addElementIdList)
    {
        this.addElementIdList = addElementIdList;
    }

    public java.util.List<java.lang.String> addFileIdList;

    public java.util.List<java.lang.String> getAddFileIdList()
    {
        return addFileIdList;
    }

    public void setAddFileIdList(java.util.List<java.lang.String> addFileIdList)
    {
        this.addFileIdList = addFileIdList;
    }

    public java.util.List<java.lang.String> delAttachmentIdList;

    public java.util.List<java.lang.String> getDelAttachmentIdList()
    {
        return delAttachmentIdList;
    }

    public void setDelAttachmentIdList(java.util.List<java.lang.String> delAttachmentIdList)
    {
        this.delAttachmentIdList = delAttachmentIdList;
    }

    public String typeId;

    public String getTypeId()
    {
        return typeId;
    }

    public void setTypeId(String typeId)
    {
        this.typeId = typeId;
    }

    public String pid;

    public String getPid()
    {
        return pid;
    }

    public void setPid(String pid)
    {
        this.pid = pid;
    }

    public String path;

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String lastModifyUserId;

    public String getLastModifyUserId()
    {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId)
    {
        this.lastModifyUserId = lastModifyUserId;
    }

    public String lastModifyRoleId;

    public String getLastModifyRoleId()
    {
        return lastModifyRoleId;
    }

    public void setLastModifyRoleId(String lastModifyRoleId)
    {
        this.lastModifyRoleId = lastModifyRoleId;
    }

    public UpdateAnnotateDTO()
    {
        this.statusId = "";
        this.content = "";
        this.fileId = "";
        this.mainFileId = "";
        this.typeId = "";
        this.pid = "";
        this.path = "";
        this.lastModifyUserId = "";
        this.lastModifyRoleId = "";
    }

    public UpdateAnnotateDTO(String statusId, String content, String fileId, String mainFileId, java.util.List<java.lang.String> addElementIdList, java.util.List<java.lang.String> addFileIdList, java.util.List<java.lang.String> delAttachmentIdList, String typeId, String pid, String path, String lastModifyUserId, String lastModifyRoleId)
    {
        this.statusId = statusId;
        this.content = content;
        this.fileId = fileId;
        this.mainFileId = mainFileId;
        this.addElementIdList = addElementIdList;
        this.addFileIdList = addFileIdList;
        this.delAttachmentIdList = delAttachmentIdList;
        this.typeId = typeId;
        this.pid = pid;
        this.path = path;
        this.lastModifyUserId = lastModifyUserId;
        this.lastModifyRoleId = lastModifyRoleId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        UpdateAnnotateDTO r = null;
        if(rhs instanceof UpdateAnnotateDTO)
        {
            r = (UpdateAnnotateDTO)rhs;
        }

        if(r != null)
        {
            if(this.statusId != r.statusId)
            {
                if(this.statusId == null || r.statusId == null || !this.statusId.equals(r.statusId))
                {
                    return false;
                }
            }
            if(this.content != r.content)
            {
                if(this.content == null || r.content == null || !this.content.equals(r.content))
                {
                    return false;
                }
            }
            if(this.fileId != r.fileId)
            {
                if(this.fileId == null || r.fileId == null || !this.fileId.equals(r.fileId))
                {
                    return false;
                }
            }
            if(this.mainFileId != r.mainFileId)
            {
                if(this.mainFileId == null || r.mainFileId == null || !this.mainFileId.equals(r.mainFileId))
                {
                    return false;
                }
            }
            if(this.addElementIdList != r.addElementIdList)
            {
                if(this.addElementIdList == null || r.addElementIdList == null || !this.addElementIdList.equals(r.addElementIdList))
                {
                    return false;
                }
            }
            if(this.addFileIdList != r.addFileIdList)
            {
                if(this.addFileIdList == null || r.addFileIdList == null || !this.addFileIdList.equals(r.addFileIdList))
                {
                    return false;
                }
            }
            if(this.delAttachmentIdList != r.delAttachmentIdList)
            {
                if(this.delAttachmentIdList == null || r.delAttachmentIdList == null || !this.delAttachmentIdList.equals(r.delAttachmentIdList))
                {
                    return false;
                }
            }
            if(this.typeId != r.typeId)
            {
                if(this.typeId == null || r.typeId == null || !this.typeId.equals(r.typeId))
                {
                    return false;
                }
            }
            if(this.pid != r.pid)
            {
                if(this.pid == null || r.pid == null || !this.pid.equals(r.pid))
                {
                    return false;
                }
            }
            if(this.path != r.path)
            {
                if(this.path == null || r.path == null || !this.path.equals(r.path))
                {
                    return false;
                }
            }
            if(this.lastModifyUserId != r.lastModifyUserId)
            {
                if(this.lastModifyUserId == null || r.lastModifyUserId == null || !this.lastModifyUserId.equals(r.lastModifyUserId))
                {
                    return false;
                }
            }
            if(this.lastModifyRoleId != r.lastModifyRoleId)
            {
                if(this.lastModifyRoleId == null || r.lastModifyRoleId == null || !this.lastModifyRoleId.equals(r.lastModifyRoleId))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::UpdateAnnotateDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, statusId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, content);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, fileId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, mainFileId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, addElementIdList);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, addFileIdList);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, delAttachmentIdList);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, typeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pid);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, path);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyRoleId);
        return h_;
    }

    public UpdateAnnotateDTO clone()
    {
        UpdateAnnotateDTO c = null;
        try
        {
            c = (UpdateAnnotateDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.statusId);
        ostr.writeString(this.content);
        ostr.writeString(this.fileId);
        ostr.writeString(this.mainFileId);
        com.maoding.common.zeroc.StringListHelper.write(ostr, this.addElementIdList);
        com.maoding.common.zeroc.StringListHelper.write(ostr, this.addFileIdList);
        com.maoding.common.zeroc.StringListHelper.write(ostr, this.delAttachmentIdList);
        ostr.writeString(this.typeId);
        ostr.writeString(this.pid);
        ostr.writeString(this.path);
        ostr.writeString(this.lastModifyUserId);
        ostr.writeString(this.lastModifyRoleId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.statusId = istr.readString();
        this.content = istr.readString();
        this.fileId = istr.readString();
        this.mainFileId = istr.readString();
        this.addElementIdList = com.maoding.common.zeroc.StringListHelper.read(istr);
        this.addFileIdList = com.maoding.common.zeroc.StringListHelper.read(istr);
        this.delAttachmentIdList = com.maoding.common.zeroc.StringListHelper.read(istr);
        this.typeId = istr.readString();
        this.pid = istr.readString();
        this.path = istr.readString();
        this.lastModifyUserId = istr.readString();
        this.lastModifyRoleId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, UpdateAnnotateDTO v)
    {
        if(v == null)
        {
            _nullMarshalValue.ice_writeMembers(ostr);
        }
        else
        {
            v.ice_writeMembers(ostr);
        }
    }

    static public UpdateAnnotateDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        UpdateAnnotateDTO v = new UpdateAnnotateDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<UpdateAnnotateDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, UpdateAnnotateDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<UpdateAnnotateDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(UpdateAnnotateDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final UpdateAnnotateDTO _nullMarshalValue = new UpdateAnnotateDTO();

    public static final long serialVersionUID = -782795018L;
}