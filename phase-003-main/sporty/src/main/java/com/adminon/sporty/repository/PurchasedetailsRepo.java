package com.adminon.sporty.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.adminon.sporty.entity.PurchaseDetails;

public interface PurchasedetailsRepo extends JpaRepository<PurchaseDetails, Long> {
	List<PurchaseDetails>findAll();
	@Query(value = "select o.orderid,o.pr_date,o.user_uid,o.ps_id, p.pr_type\r\n"
			+ "from order_details as o\r\n"
			+ "left join product_details as p\r\n"
			+ "on o.ps_id=p.id;",nativeQuery=true)
	List<PurchaseDetails>joinwith();
}
