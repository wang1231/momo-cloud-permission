package com.momo.mapper.req.authority;

import com.momo.common.error.BaseReq;
import com.momo.mapper.dataobject.RoleAclDO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * Created by MOMO on 2019/3/22.
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(of = {"id"})
public class BatchRoleUserReq extends BaseReq {
    //##########        角色列表给用户
    @NotBlank(message = "用户uuid 必填", groups = {Status.class})
    private String userUuid;
    private List<Long> roles;

    //##########        权限列表给角色
    @NotBlank(message = "角色uuid 必填", groups = {Permission.class})
    private String roleUuid;
    private List<RoleAclDO> acls;

}