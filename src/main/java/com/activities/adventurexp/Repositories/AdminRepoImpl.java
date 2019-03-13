package com.activities.adventurexp.Repositories;

import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Merchandise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

@Repository
public class AdminRepoImpl implements AdminRepo{
    public AdminRepoImpl() {
    }

    @Autowired
    JdbcTemplate template;


    Logger log = Logger.getLogger(AdminRepoImpl.class.getName());

    @Override
    public Activities addActivities(Activities activities) {


        String sql = "INSERT INTO AdventureXP.Activities VALUE(default, ?, ?)";
        String activityName = activities.getActivityName();
        String activityDescription = activities.getActivityDescription();


        log.info("AddActivity called");
        this.template.update(sql, activityName, activityDescription);

        return activities;
    }

    @Override
    public Merchandise getMerchandise(int id) {
        String sql = "SELECT * FROM AdventureXP.Merchandise WHERE MerchandiseId="+id;

        return this.template.query(sql, new ResultSetExtractor<Merchandise>() {
            @Override
            public Merchandise extractData(ResultSet rs) throws SQLException, DataAccessException {

                Merchandise merch = new Merchandise();

                String merchName, merchDesc;
                int merchId, merchStock;
                double merchPrice;

                while (rs.next()) {
                    merchId = rs.getInt("MerchandiseId");
                    merchStock = rs.getInt("MerchandiseStock");
                    merchName = rs.getString("MerchandiseName");
                    merchDesc = rs.getString("MerchandiseDescription");
                    merchPrice = rs.getDouble("MerchandisePrice");

                    merch.setMerchDesc(merchDesc);
                    merch.setMerchName(merchName);
                    merch.setMerchId(merchId);
                    merch.setMerchPrice(merchPrice);
                    merch.setMerchStock(merchStock);
                }
                return merch;
            }
        });
    }

    @Override
    public Merchandise updateMerch(Merchandise merch) {
        String sql = "UPDATE Merchandise SET MerchandiseName = ?, MerchandiseDescription = ?, MerchandisePrice = ?, MerchandiseStock = ?  WHERE MerchandiseId = ?";
        String merchName = merch.getMerchName();
        String merchDesc = merch.getMerchDesc();
        int merchId = merch.getMerchId();
        int merchStock = merch.getMerchStock();
        double merchPrice = merch.getMerchPrice();


        this.template.update(sql, merchName, merchDesc, merchPrice, merchStock, merchId);
        return merch;
    }


}
