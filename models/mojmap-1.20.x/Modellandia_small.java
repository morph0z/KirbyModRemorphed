// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellandia_small<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "landia_small"), "main");
	private final ModelPart wingleft;
	private final ModelPart wingright;
	private final ModelPart bb_main;

	public Modellandia_small(ModelPart root) {
		this.wingleft = root.getChild("wingleft");
		this.wingright = root.getChild("wingright");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft", CubeListBuilder.create().texOffs(22, 4)
				.mirror().addBox(1.5F, -11.0F, 3.0F, 2.0F, 0.75F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 21).mirror().addBox(2.5F, -11.0F, 2.0F, 2.0F, 0.75F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(10, 28).mirror()
				.addBox(4.5F, -10.75F, 3.0F, 0.5F, 0.0F, 2.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(9, 28)
				.mirror().addBox(5.0F, -10.75F, 3.0F, 0.5F, 0.0F, 2.5F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 30).mirror().addBox(5.5F, -10.75F, 3.5F, 0.5F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(10, 28).mirror()
				.addBox(6.0F, -10.75F, 4.0F, 0.5F, 0.0F, 1.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 28)
				.mirror().addBox(1.5F, -10.75F, 3.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 32.0F, -2.0F));

		PartDefinition cube_r1 = wingleft.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(17, 17).mirror()
						.addBox(6.7F, -11.0F, 0.4F, 4.0F, 0.75F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright",
				CubeListBuilder.create().texOffs(22, 4)
						.addBox(-3.5F, -11.0F, 3.0F, 2.0F, 0.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 21)
						.addBox(-4.5F, -11.0F, 2.0F, 2.0F, 0.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 28)
						.addBox(-5.5F, -10.75F, 3.0F, 0.5F, 0.0F, 2.5F, new CubeDeformation(0.0F)).texOffs(8, 30)
						.addBox(-6.0F, -10.75F, 3.5F, 0.5F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 28)
						.addBox(-6.5F, -10.75F, 4.0F, 0.5F, 0.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(10, 28)
						.addBox(-5.0F, -10.75F, 3.0F, 0.5F, 0.0F, 2.5F, new CubeDeformation(0.0F)).texOffs(4, 28)
						.addBox(-4.5F, -10.75F, 3.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 32.0F, -2.0F));

		PartDefinition cube_r2 = wingright
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(17, 17).addBox(-10.7F, -11.0F, 0.4F, 4.0F, 0.75F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(1, 7)
				.addBox(-2.0F, -0.8F, -5.0F, 4.0F, 0.8F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 21)
				.addBox(-1.0F, -0.75F, -6.0F, 2.0F, 0.25F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 24)
				.addBox(-2.0F, -2.0F, -6.0F, 4.0F, 1.25F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
				.addBox(-1.0F, -2.25F, -6.0F, 2.0F, 0.25F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 12)
				.addBox(-2.0F, -4.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 12).mirror()
				.addBox(1.0F, -4.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(17, 19)
				.addBox(-2.0F, -4.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 7)
				.addBox(-2.0F, -4.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 7).mirror()
				.addBox(1.0F, -4.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(27, 58)
				.mirror().addBox(1.0F, -1.45F, -1.8F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 58).addBox(-2.0F, -1.45F, -1.8F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 19).mirror().addBox(1.0F, -4.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(20, 10).addBox(-1.0F, -4.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(2, 14).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 2.75F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 1)
				.addBox(-1.5F, -0.15F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(26, 0).mirror()
						.addBox(-2.5F, -1.0F, 12.0F, 1.75F, 2.75F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(26, 0).addBox(0.75F, -1.0F, 12.0F, 1.75F, 2.75F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -5.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 5).mirror()
				.addBox(1.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 22)
				.mirror().addBox(1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 5).addBox(-2.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
				.addBox(-2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -5.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -3.0F, 11.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -5.0F, 1.223F, -0.0298F, -0.082F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 28).mirror()
						.addBox(0.0F, -3.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.0F, -5.0F, 1.223F, 0.0298F, 0.082F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.wingright.zRot = (EndMathProcedure.sin(ageInTicks * 0.6F) * 0.6F);
		this.wingleft.zRot = (EndMathProcedure.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}