package br.com.marciorodrigues.LakeSideHotel.repositories;

import br.com.marciorodrigues.LakeSideHotel.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, String> {
}
