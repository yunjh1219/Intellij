package mybatis.du.db;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

@Mapper
public interface MemberMapper {
	@Select("select count(*) from members where email = #{email} and password = #{password}")
	public int isMember(MemberDto memberDto);
	
	@Select("select * from members where email = #{email} and password = #{password}")
	public MemberDto findMember(MemberDto memberDto);
	
	@Insert("INSERT INTO members (MEMBER_ID, NAME, EMAIL, PASSWORD) VALUES (MEMBERS_seq.nextval,#{name},#{email},#{password})")
	public void insertMember(MemberDto memberDto);
}