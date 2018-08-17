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

public class SummaryFileDTO implements java.lang.Cloneable,
                                       java.io.Serializable
{
    public long totalUsageSize;

    public long getTotalUsageSize()
    {
        return totalUsageSize;
    }

    public void setTotalUsageSize(long totalUsageSize)
    {
        this.totalUsageSize = totalUsageSize;
    }

    public long totalAllocSize;

    public long getTotalAllocSize()
    {
        return totalAllocSize;
    }

    public void setTotalAllocSize(long totalAllocSize)
    {
        this.totalAllocSize = totalAllocSize;
    }

    public java.util.List<SummaryFileCompanyDTO> companyList;

    public java.util.List<SummaryFileCompanyDTO> getCompanyList()
    {
        return companyList;
    }

    public void setCompanyList(java.util.List<SummaryFileCompanyDTO> companyList)
    {
        this.companyList = companyList;
    }

    public SummaryFileDTO()
    {
    }

    public SummaryFileDTO(long totalUsageSize, long totalAllocSize, java.util.List<SummaryFileCompanyDTO> companyList)
    {
        this.totalUsageSize = totalUsageSize;
        this.totalAllocSize = totalAllocSize;
        this.companyList = companyList;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        SummaryFileDTO r = null;
        if(rhs instanceof SummaryFileDTO)
        {
            r = (SummaryFileDTO)rhs;
        }

        if(r != null)
        {
            if(this.totalUsageSize != r.totalUsageSize)
            {
                return false;
            }
            if(this.totalAllocSize != r.totalAllocSize)
            {
                return false;
            }
            if(this.companyList != r.companyList)
            {
                if(this.companyList == null || r.companyList == null || !this.companyList.equals(r.companyList))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::SummaryFileDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, totalUsageSize);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, totalAllocSize);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, companyList);
        return h_;
    }

    public SummaryFileDTO clone()
    {
        SummaryFileDTO c = null;
        try
        {
            c = (SummaryFileDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeLong(this.totalUsageSize);
        ostr.writeLong(this.totalAllocSize);
        SummaryFileCompanyListHelper.write(ostr, this.companyList);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.totalUsageSize = istr.readLong();
        this.totalAllocSize = istr.readLong();
        this.companyList = SummaryFileCompanyListHelper.read(istr);
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, SummaryFileDTO v)
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

    static public SummaryFileDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        SummaryFileDTO v = new SummaryFileDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<SummaryFileDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, SummaryFileDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<SummaryFileDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(SummaryFileDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final SummaryFileDTO _nullMarshalValue = new SummaryFileDTO();

    public static final long serialVersionUID = 877342229L;
}