package dao.dao.base;

import dao.model.base.Token;
import dao.model.base.TokenCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    long countByExample(TokenCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    int deleteByExample(TokenCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String tokenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    int insert(Token record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    int insertSelective(Token record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    List<Token> selectByExample(TokenCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    Token selectByPrimaryKey(String tokenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Token record, @Param("example") TokenCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Token record, @Param("example") TokenCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Token record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Token record);
}