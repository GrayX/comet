package com.grayxcj.comet.common.mapper;

import com.grayxcj.comet.common.domain.GrayCometMachine;
import com.grayxcj.comet.common.domain.GrayCometMachineExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface GrayCometMachineMapper extends impl {
    int countByExample(GrayCometMachineExample example);

    int deleteByExample(GrayCometMachineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GrayCometMachine record);

    int insertSelective(GrayCometMachine record);

    List<GrayCometMachine> selectByExampleWithBLOBsWithRowbounds(GrayCometMachineExample example, RowBounds rowBounds);

    List<GrayCometMachine> selectByExampleWithBLOBs(GrayCometMachineExample example);

    List<GrayCometMachine> selectByExampleWithRowbounds(GrayCometMachineExample example, RowBounds rowBounds);

    List<GrayCometMachine> selectByExample(GrayCometMachineExample example);

    GrayCometMachine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GrayCometMachine record, @Param("example") GrayCometMachineExample example);

    int updateByExampleWithBLOBs(@Param("record") GrayCometMachine record, @Param("example") GrayCometMachineExample example);

    int updateByExample(@Param("record") GrayCometMachine record, @Param("example") GrayCometMachineExample example);

    int updateByPrimaryKeySelective(GrayCometMachine record);

    int updateByPrimaryKeyWithBLOBs(GrayCometMachine record);

    int updateByPrimaryKey(GrayCometMachine record);
}