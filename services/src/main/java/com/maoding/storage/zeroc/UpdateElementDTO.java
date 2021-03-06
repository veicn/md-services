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

public class UpdateElementDTO implements java.lang.Cloneable,
                                         java.io.Serializable
{
    public String title;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public byte[] dataArray;

    public byte[] getDataArray()
    {
        return dataArray;
    }

    public void setDataArray(byte[] dataArray)
    {
        this.dataArray = dataArray;
    }

    public byte getDataArray(int index)
    {
        return this.dataArray[index];
    }

    public void setDataArray(int index, byte val)
    {
        this.dataArray[index] = val;
    }

    /**
     **/
    @Deprecated
    public long lastModifyTimeStamp;

    /**
     **/
    @Deprecated
    public long getLastModifyTimeStamp()
    {
        return lastModifyTimeStamp;
    }

    /**
     **/
    @Deprecated
    public void setLastModifyTimeStamp(long lastModifyTimeStamp)
    {
        this.lastModifyTimeStamp = lastModifyTimeStamp;
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

    public UpdateElementDTO()
    {
        this.title = "";
        this.lastModifyUserId = "";
        this.lastModifyRoleId = "";
    }

    public UpdateElementDTO(String title, byte[] dataArray, long lastModifyTimeStamp, String lastModifyUserId, String lastModifyRoleId)
    {
        this.title = title;
        this.dataArray = dataArray;
        this.lastModifyTimeStamp = lastModifyTimeStamp;
        this.lastModifyUserId = lastModifyUserId;
        this.lastModifyRoleId = lastModifyRoleId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        UpdateElementDTO r = null;
        if(rhs instanceof UpdateElementDTO)
        {
            r = (UpdateElementDTO)rhs;
        }

        if(r != null)
        {
            if(this.title != r.title)
            {
                if(this.title == null || r.title == null || !this.title.equals(r.title))
                {
                    return false;
                }
            }
            if(!java.util.Arrays.equals(this.dataArray, r.dataArray))
            {
                return false;
            }
            if(this.lastModifyTimeStamp != r.lastModifyTimeStamp)
            {
                return false;
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::UpdateElementDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, title);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, dataArray);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyRoleId);
        return h_;
    }

    public UpdateElementDTO clone()
    {
        UpdateElementDTO c = null;
        try
        {
            c = (UpdateElementDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.title);
        ostr.writeByteSeq(this.dataArray);
        ostr.writeLong(this.lastModifyTimeStamp);
        ostr.writeString(this.lastModifyUserId);
        ostr.writeString(this.lastModifyRoleId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.title = istr.readString();
        this.dataArray = istr.readByteSeq();
        this.lastModifyTimeStamp = istr.readLong();
        this.lastModifyUserId = istr.readString();
        this.lastModifyRoleId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, UpdateElementDTO v)
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

    static public UpdateElementDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        UpdateElementDTO v = new UpdateElementDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<UpdateElementDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, UpdateElementDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<UpdateElementDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(UpdateElementDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final UpdateElementDTO _nullMarshalValue = new UpdateElementDTO();

    public static final long serialVersionUID = -941789211L;
}
