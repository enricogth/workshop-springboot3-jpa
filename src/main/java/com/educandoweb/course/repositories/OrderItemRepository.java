package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrderItemPK;

//it doesn't need to be a Spring component, because it extends JpaRepository, which is a Spring component
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
}
